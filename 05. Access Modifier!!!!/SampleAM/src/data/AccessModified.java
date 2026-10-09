package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class AccessModified {
    private String pri;
    String def;
    protected String pro;
    public String pub;

    public AccessModified(String pri, String def, String pro, String pub) {
        this.pri = pri;
        this.def = def;
        this.pro = pro;
        this.pub = pub;
    }

    public AccessModified(String pri, String def) {
        this.pri = pri;
        this.def = def;
    }
    
    
    
    private void privateFunction(){
        System.out.println("Hàm này chấm là ko thấy");
    }
    void defaultFunction(){
        System.out.println("Chỉ có các class cùng 1 package mới thấy đc");
    }
    protected void protectedFunction(){
        System.out.println("Chỉ có 2 trường hợp đc thấy: "
                + "trong cùng 1 package hoặc sub-class(inheritance)");
    }
    public void publicFunction(){
        System.out.println("Miễn là cùng 1 project, mọi class đều thấy đc");
    }
}
