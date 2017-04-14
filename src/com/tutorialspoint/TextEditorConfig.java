/**
 * $RCSfile$
 * $Revision$
 * $Date$
 * $Source$
 * $Author$
 */
package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
   @Bean 
   public TextEditor textEditor(){
	   System.out.println("Inside TextEditor config." );
      return new TextEditor( spellChecker() );
   }

   @Bean 
   public SpellChecker spellChecker(){
	   System.out.println("Inside SpellChecker config." );
      return new SpellChecker( );
   }
}