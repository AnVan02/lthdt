
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SXSoLuong implements Comparator<SachGK> {

    @Override
    public int compare(SachGK o1, SachGK o2) {
        return (o2.soluong-o1.soluong);
    }
    
}
