/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rado.com528.ood;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Radoslav
 */
public class MyTestClassTest {

    @Test

    public void shouldAnswerWithTrue() {
        MyTestClassLog4j myTest = new MyTestClassLog4j();
        myTest.writeAboutMe();
    }

    @Test
    public void shouldAnswerWithName() {
        MyTestClassLog4j myTest = new MyTestClassLog4j();
        String result = myTest.TalkAboutMe("Rado");
        System.out.println(result);
        assertTrue("talking about Rado".equals(result));
    }
}
