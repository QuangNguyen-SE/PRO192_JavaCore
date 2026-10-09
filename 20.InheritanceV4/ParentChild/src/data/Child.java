/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LENOVO
 */

public class Child extends Parent{

    private String assetThree;

    public Child(String assetThree, String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
        this.assetThree=assetThree;
        //Câu lệnh của super phải nằm đầu tiên trong constructor !!!
        //BẮT BUỘC PHẢI NEW CHA TRC MỚI EXTENDS ĐC
        //Phải có chỗ trong RAM trc rồi mới lưu thằng dị biệt khác của con đc.
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    
    public void sayHi(){
        System.out.println("Hi!!!");
    }
    
    @Override
    public void showProfile(){
        System.out.println("Parent <> assetOne:" + assetOne + ";" + "assetTwo" + assetTwo);
    //Con có quyền khác Cha về các đặc điểm & hành vi (Kế thừa & OVERRIDE)
    }
    
}

