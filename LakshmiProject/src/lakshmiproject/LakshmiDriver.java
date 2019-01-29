/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lakshmiproject;

/**
 *
 * @author S530458
 */
public class LakshmiDriver {
    private int a;
    private int b;
    private int c;
    public int z;
    protected int y;

    public LakshmiDriver(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public LakshmiDriver() {
    }
     public int add(int y, int z){
         return y+z;
     }
    @Override
    public String toString() {
        return "LakshmiDriver{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

      
}
