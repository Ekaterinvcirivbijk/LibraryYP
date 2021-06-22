/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.enums;

/**
 *
 * @author nalbandyan
 */
public enum Genre {
    STORY,
    NOVEL,
    EPIC,
    POEM,
    COLLECTION,
    TEXTBOOK,
    DICTIONARY;
    
    private String[] russianNames = new String[] { "Повесть",
                                                    "Роман",
                                                    "Эпопея",
                                                    "Поэма",
                                                    "Сборник",
                                                    "Учебник",
                                                    "Словарь" };
    
    public String toString()
    {
        return russianNames[ordinal()];
    }
    
}
