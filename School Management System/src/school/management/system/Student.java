/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system;

/**
 *
 * @author mthus
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    
    public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

   
    public void setGrade(int grade){
        this.grade=grade;
    }


    
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    
    public int getId() {
        return id;
    }

        public String getName() {
        return name;
    }

    
    public int getGrade() {
        return grade;
    }

    
    public int getFeesPaid() {
        return feesPaid;
    }

    
    public int getFeesTotal() {
        return feesTotal;
    }
    
}
