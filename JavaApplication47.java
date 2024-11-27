/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class JavaApplication47 {
    private LoginUI loginUI;
    private SignupUI signUpUI;
    private ValidationUI validationUI;
    private DashboardUser dashboardUser;
    private DashboardLib dashboardLib;
    
    
        public static void main(String[] args) {
        // Show the ValidationUI screen first
        SwingUtilities.invokeLater(() -> {
            new ValidationUI();
        });
            
    }
}