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
public class Parent {
    protected String assetOne;
    protected String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" + "assetOne=" + assetOne + ", assetTwo=" + assetTwo + '}';
    }
    
    public void showProfile(){
        System.out.println("Parent <> assetOne:" + assetOne + ";" + "assetTwo" + assetTwo);
    }
}
