/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaDeInventarios;

import Controlador.CtrlUnidadDeMedida;
import Modelo.UnidadDeMedida;
import Modelo.UnidadDeMedidaSQL;
import Vista.FrmUnidadDeMedida;

/**
 *
 * @author ialonzo
 */
public class SistemaDeInventarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnidadDeMedida um = new UnidadDeMedida();
        UnidadDeMedidaSQL modC = new UnidadDeMedidaSQL();
        FrmUnidadDeMedida frm = new FrmUnidadDeMedida();
        
        CtrlUnidadDeMedida ctrl = new CtrlUnidadDeMedida(um, modC, frm);
        ctrl.Iniciar();
        frm.setVisible(true);
    }
    
}
