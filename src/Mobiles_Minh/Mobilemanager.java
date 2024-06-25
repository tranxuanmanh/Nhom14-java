
package Mobiles_Minh;

import java.util.List;

/**
 *
 * @author TUAN MINH
 */
public interface Mobilemanager {
    public boolean  addMobile(Mobile m);
    public boolean  editMobile(Mobile m);
    public boolean  delMobile(Mobile m);
    public List<Mobile> searcMobile_byName(String name);
    public List<Mobile> searcMobile_byPrice(double price);
    public List<Mobile> searcMobile_byMemory(int memory);
    public List<Mobile> searcMobile_byColor(String color);
    public List<Mobile> searcMobile_byBattery(double battery);
    public List<Mobile> sortedMobile_byPrice();
}
