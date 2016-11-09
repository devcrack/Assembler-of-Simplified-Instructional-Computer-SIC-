/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexer_Parser;

import SIC_ST.C_Pre_Comp;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Iterator;

/**
 *
 * @author devcrack
 */
public class ObjCode_Generate extends Gram_SICBaseVisitor<Integer> 
{
    C_Pre_Comp cod_Obj;
    
    public ObjCode_Generate(C_Pre_Comp a_precomp) 
    {  
        this.cod_Obj = a_precomp; 
    }
    
    /**
     * Directive START 
     * In this visitor the program Counter is initialize and this directive not generate object code.
     * @param ctx
     * @return 
     */
    @Override
    public  Integer visitStart(Gram_SICParser.StartContext ctx) 
    {
        if(!this.cod_Obj.getFlag())
        {
            int cp_Start = Integer.parseInt(ctx.HEX().getText().substring(0, ctx.HEX().getText().length() - 1)); //Get the value of CP from program
            this.cod_Obj.setNom_program(ctx.ID().getText());
            if(cp_Start >0 )
            {
                this.cod_Obj.getTotal_CP().add(String.valueOf(cp_Start)); //Add value of cp to CP of compiler_superchafa
                cod_Obj.setProgram_Counter(String.valueOf(cp_Start));    //
                
                return cp_Start;
            }
        }        
        else
            this.cod_Obj.getObject_code().add("START not generate O.C");

        return visitChildren(ctx); 
    }


    /**
     * Rule Grammar 
     *                 ID? INSTR ID  
                   |   ID? INSTR ID  COMA 'X'
     * Obviously generates Object Code. !!!!!!!!!!!!!!!!!!!!
     * @param ctx
     * @return 
     */
    @Override
    public  Integer visitInstr(Gram_SICParser.InstrContext ctx) 
    {
        if(!this.cod_Obj.getFlag()) 
        {
            if(ctx.ID().size() > 1) 
                this.cod_Obj.getTab_Simb().put(ctx.ID(0).toString(), this.cod_Obj.getProgram_Counter());                          
            this.increment_cp(3);
        }
        else
        {
            String cod_Object; 
            String val_id_mem = "";
            String  instr;  
            
            if(ctx.ID().size() > 0)                                                                    //This verification is for to know whether the instruction
            {                                                                                         // have operators like RSUB that not have
                String id_mem = (ctx.ID().size() > 1) ? ctx.ID(1).toString() : ctx.ID(0).toString();    //Get the simbol for the label of this INSTRUCTION
                val_id_mem = this.cod_Obj.getTab_Simb().get(id_mem);                          //Get the value from tabsimb for this Label
                instr = ctx.INSTR().getText();
            }           
            else
                instr = ctx.start.getText();
           cod_Object = Gram_SICBaseVisitor.tab_Simb.get(instr);                 // Get the operation Code of this instruction             
           if(ctx.stop.getText().compareTo("X") == 0)                                           // Determine whether we have a Index.
           {
               int val_to_add = Integer.parseInt("" + val_id_mem.charAt(0) + "", 16);          // We can use instead Character.toString(value_id_mem.charAt(0)
               
               val_to_add += 8;
               if(val_to_add <= 15)
               {
                   val_id_mem = val_id_mem.substring(1, val_id_mem.length());
                   val_id_mem = Integer.toHexString(val_to_add) + val_id_mem;
               }
               else
                   val_id_mem ="ffff";
           }
           cod_Object += val_id_mem;
           this.cod_Obj.getObject_code().add(cod_Object);                        // Store the object Code.
        }
        return visitChildren(ctx); 
    }
    
    
     /**
      * Visitor for rule grammar :  ID 'BYTE' 'C 'ID'
      * It generates Object Code!!!!!!!!!!!!!!!!!!!!!
      * @param ctx
      * @return 
      */
    @Override 
    public Integer visitByte_Dec(Gram_SICParser.Byte_DecContext ctx) 
    { 
        String tmp_str = ctx.ID(1).getText();
        
        if(!this.cod_Obj.getFlag()) 
        {
            this.cod_Obj.getTab_Simb().put(ctx.ID(0).toString(), this.cod_Obj.getProgram_Counter());    //Setting the values of symbol table
            this.increment_cp(tmp_str.length());                                                       //Increasing the PC.
        }
        else
        {
            String cod_ob = "";
            
            for(int i = 0; i < tmp_str.length(); i++ )
                cod_ob += Gram_SICBaseVisitor.ascii_code.get("" + tmp_str.charAt(i) +"");
            this.cod_Obj.getObject_code().add(cod_ob);
        }
        
        return visitChildren(ctx); 
       
   }
   
   /**
    * Visitor for Rule Grammar : ID 'BYTE' X 'HEX'
    * Generate Object Code.!!!!!!!!!!!!!!!!!!!!!!!!!!
    * @param ctx
    * @return 
    */
   @Override 
   public Integer visitByte_Hex(Gram_SICParser.Byte_HexContext ctx) 
   { 
       if(!this.cod_Obj.getFlag()) 
       {
           this.cod_Obj.getTab_Simb().put(ctx.ID().toString(), this.cod_Obj.getProgram_Counter());                 //Setting values in symbol Table
           this.increment_cp(( (ctx.HEX().toString().length() - 1) / 2 )  + ( (ctx.HEX().toString().length() - 1) % 2 )); //Increasing the CP.
       }
       else 
       {
           String val_hex ="";
           
           for( int i = ctx.HEX().getText().length(); i < 6; i++)
               val_hex +="0";
           val_hex += ctx.HEX().getText();
           this.cod_Obj.getObject_code().add(val_hex);
       }
           
       return visitChildren(ctx); 
   }
   
   /**
    * 
    * @param val Value that will increase to CP. This value is in decimal base.
    */
   private void increment_cp(int val)
   {
       int cp;
       String str_cp = this.cod_Obj.getProgram_Counter();
       
       this.cod_Obj.getTotal_CP().add(str_cp);
       cp  = Integer.parseInt(str_cp, 16);                          // Converting the value of CP to Decimal
       cp += val;
       str_cp = Integer.toHexString(cp);                                       // Rollback the value of CP to Hexadecimal.
       this.cod_Obj.setProgram_Counter(str_cp);
   }
   
   
   /**
    * Rule Grammar ID 'WORD' HEX |   ID 'WORD' DEC                   
    * It generates Object Code!!!!!!
    * @param ctx
    * @return 
    */
   @Override public Integer visitWord(Gram_SICParser.WordContext ctx) 
   { 
       if(!this.cod_Obj.getFlag()) 
       {
           this.cod_Obj.getTab_Simb().put(ctx.ID().toString(),this.cod_Obj.getProgram_Counter());  //Setting values in symbol table
           this.increment_cp(3);                                                                  //Increasing the CP.
       }
       else
       {
           String 
                   str = "",
                   val_hex;
           if(ctx.stop.getText().charAt(ctx.stop.getText().length() - 1) != 'H')          
               val_hex = Integer.toHexString(Integer.parseInt(ctx.DEC().getText()));               
           else 
               val_hex = ctx.HEX().getText();
           for(int i = val_hex.length(); i < 6; i++) 
                str+= "0";
           str += val_hex;
           this.cod_Obj.getObject_code().add(str);
       }
       
       return visitChildren(ctx); 
   }
   
   
   /**
    * This method is for Rule Grammar ID 'RESW' HEX .
    * Does not Generate Object Code.
    * @param ctx
    * @return 
    */
   @Override 
   public Integer visitReserve_Words_Hex(Gram_SICParser.Reserve_Words_HexContext ctx) 
   { 
       if(!this.cod_Obj.getFlag()) {
           this.cod_Obj.getTab_Simb().put(ctx.ID().toString(), this.cod_Obj.getProgram_Counter());  //Setting values in symbol table
           this.increment_cp((Integer.parseInt(ctx.HEX().getText().substring(0, ctx.HEX().getText().length() -1 ),16)) * 3);
       }
       else
           this.cod_Obj.getObject_code().add("RESW not generate O.C");
       
       return visitChildren(ctx); 
   }
   
   
   /**
    * For rule grammar ID 'RESB' DEC
    * Does Not generate object code. CUT Register T
    * @param ctx
    * @return 
    */
   @Override 
   public Integer visitReserve_Bytes_Dec(Gram_SICParser.Reserve_Bytes_DecContext ctx) 
   { 
       if(!this.cod_Obj.getFlag())
       {
           this.cod_Obj.getTab_Simb().put(ctx.ID().toString(), this.cod_Obj.getProgram_Counter());  //Setting value in symbol table
           this.increment_cp(Integer.parseInt(ctx.DEC().getText()));
       }
       else
           this.cod_Obj.getObject_code().add("RESB not generate O.C");
       
       return visitChildren(ctx);
   }
   
   
   /**
    * For rule grammar ID 'RESB' HEX             
    * Does Not Generate Object Code. CUT REGISTER 'T'
    * @param ctx
    * @return 
    */
   @Override 
   public Integer visitReserve_Bytes_Hex(Gram_SICParser.Reserve_Bytes_HexContext ctx)
   { 
       if(!this.cod_Obj.getFlag()) 
       {
           this.cod_Obj.getTab_Simb().put(ctx.ID().toString(), this.cod_Obj.getProgram_Counter());  //Setting value in symbol table
           this.increment_cp(Integer.parseInt(ctx.HEX().getText().substring(0, ctx.HEX().getText().length() -1), 16));
       }
       else
            this.cod_Obj.getObject_code().add("RESW not generate O.C");
       
       return visitChildren(ctx); 
   }
   
   
   /**
    * Grammar Rule ID 'RESW' DEC 
    * Does NOT generate Object Code. CUT REGISTER
    * @param ctx
    * @return 
    */
   @Override
   public Integer visitReserve_Words_Dec(Gram_SICParser.Reserve_Words_DecContext ctx) 
   { 
       if(!this.cod_Obj.getFlag()) 
       {
           this.cod_Obj.getTab_Simb().put(ctx.ID().toString(), this.cod_Obj.getProgram_Counter());  //Setting values in symbol table
           this.increment_cp(Integer.parseInt((ctx.DEC().getText())) * 3);                          //Increasing the CP.
       }
       else
           this.cod_Obj.getObject_code().add("RESW not generate O.C");
       
       return visitChildren(ctx); 
   }

   
   /**
    * Grammar Rule: 'END' ID?;
    * Does NOT Generate Object Code.
    * @param ctx
    * @return 
    */
   @Override
   public Integer visitEnding(Gram_SICParser.EndingContext ctx) 
   {
       if(!this.cod_Obj.getFlag()) 
           this.cod_Obj.getTotal_CP().add(this.cod_Obj.getProgram_Counter());           
       else
       {
           this.cod_Obj.getObject_code().add("END No generate O.C");
           if(ctx.ID()!= null)
               this.cod_Obj.setHas_end_dir(this.cod_Obj.getTab_Simb().get(ctx.ID().getText()));
       }
       
       return visitChildren(ctx);
   }
}
