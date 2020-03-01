package magazamodul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Storemodule {
	Connection con = null;
	Statement sta = null;
	PreparedStatement psta = null;
	ResultSet rs = null;

	database db = new database();
	public static int aut;

	public boolean log(String name, String password) {
		String query = "Select * from user where UserName =? and Password=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.setString(2, password);

			rs = psta.executeQuery();
			if (rs.next()) {
				int authority = rs.getInt("Authorization");
				if (authority == 1) {
					aut = 1;
				} else if (authority == 2) {
					aut = 2;
				}
			}
			return true;

		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public ArrayList<String> getposition() {
		String query = "select distinct PositionName from position";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String positionname = rs.getString("PositionName");
				list.add(positionname);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getdepartment() {
		String query = "select distinct DepartmentName from department";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String departmentname = rs.getString("DepartmentName");
				list.add(departmentname);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getstore() {
		String query = "select distinct BranchName from store";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String storename = rs.getString("BranchName");
				list.add(storename);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getpersonnel() {
		String query = "select distinct PersonnelName from personnel";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String personnelname = rs.getString("PersonnelName");
				list.add(personnelname);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getcategory() {
		String query = "select distinct CategoryNames from categoryname";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String categoryname = rs.getString("CategoryNames");
				list.add(categoryname);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getcolor() {
		String query = "select distinct ColorCode from color";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String colorcode = rs.getString("ColorCode");
				list.add(colorcode);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getpattern() {
		String query = "select distinct PatternName from pattern";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String patternname = rs.getString("PatternName");
				list.add(patternname);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getbrand() {
		String query = "select distinct BrandName from brand";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String brandname = rs.getString("BrandName");
				list.add(brandname);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getsize() {
		String query = "select distinct SizeName from size";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String sizename = rs.getString("SizeName");
				list.add(sizename);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> gettype() {
		String query = "select distinct TypeName from type";
		ArrayList<String> list = new ArrayList<String>();
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String typename = rs.getString("TypeName");
				list.add(typename);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public void addpersonnel(String name, String surname, String position, String department, String store,
			String phone, String salary, String address) {
		String query = "insert into personnel (PersonnelName,PersonnelSurname,PersonnelPhoneNum,PersonnelAddress,Salary,DepartmentID,PositionID,StoreID) values (?,?,?,?,?,(select DepartmentID from department where DepartmentName=?),(select PositionID from position where PositionName=?),(select StoreID from store where BranchName=?))";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.setString(2, surname);
			psta.setString(3, phone);
			psta.setString(4, address);
			psta.setString(5, salary);
			psta.setString(6, department);
			psta.setString(7, position);
			psta.setString(8, store);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "Personnel Added");

		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void addproduct(String name, String barcode, String price, String category) {
		String query = "insert into product (ProductName,ProductPrice,CategoryID,Barcode) values (?,?,(select CategoryID from category where CategoryNameID=(select CategoryNameID from categoryname where CategoryNames=?)),?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.setString(2, price);
			psta.setString(3, category);
			psta.setString(4, barcode);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "Product Added");

		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void addcategory(String name) {
		String query = "insert into categoryname(CategoryNames) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "category name added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void addpattern(String name) {
		String query = "insert into pattern(PatternName) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "Pattern Name Added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void addcolor(String name) {
		String query = "insert into color(ColorCode) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "Color Name Added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void addbrand(String name) {
		String query = "insert into brand(BrandName) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "Brand name added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void addsize(String name) {
		String query = "insert into size(SizeName) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "size name added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void addtype(String name) {
		String query = "insert into type(TypeName) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "type name added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	/*
	 * public String stokgetir(String barkod){ String
	 * sorgu="select * from stok where UrunId=(select UrunId from urun where Barkod=?)"
	 * ; String stk; try { psta=con.prepareStatement(sorgu); psta.setString(1,
	 * barkod); psta.executeQuery(); return stk; } catch (SQLException ex) {
	 * Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex); }
	 * }
	 */
//    public void stokdus(String barkod){
//        String sorgu="update stok";
//    }

	public ArrayList<String> getuser() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from user";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("UserID");
				String name = rs.getString("UserName");
				String password = rs.getString("Password");
				String aut = rs.getString("Authorization");
				list.add(0, id);
				list.add(1, name);
				list.add(2, password);
				list.add(3, aut);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> listgetstore() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from store";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("StoreID");
				String name = rs.getString("BranchName");
				String phone = rs.getString("StorePhoneNumber");
				String address = rs.getString("StoreAddress");
				String city = rs.getString("City");
				list.add(0, id);
				list.add(1, name);
				list.add(2, phone);
				list.add(3, address);
				list.add(4, city);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> listgetposition() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from position";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("PositionID");
				String name = rs.getString("PositionName");
				list.add(0, id);
				list.add(1, name);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> listgetdepartment() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from department";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("DepartmentID");
				String name = rs.getString("DepartmentName");
				list.add(0, id);
				list.add(1, name);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getsales() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from sales";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("SalesID");
				String number = rs.getString("SalesNumber");
				String date = rs.getDate("SalesDate").toString();
				String product = rs.getString("ProductID");
				list.add(0, id);
				list.add(1, number);
				list.add(2, date);
				list.add(3, product);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getsales2() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from sales";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("SalesID");
				String number = rs.getString("SalesNumber");
				String date = rs.getString("SalesDate");
				String product = rs.getString("ProductID");
				String store = rs.getString("StoreID");
				String personnel = rs.getString("PersonnelID");
				list.add(0, id);
				list.add(1, number);
				list.add(2, date);
				list.add(3, product);
				list.add(4, store);
				list.add(5, personnel);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getstock(String barcode) {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from stock where ProductID=(select ProductID from product where Barcode='" + barcode
				+ "')";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("StockID");
				String number = rs.getString("StockNumber");
				String product = rs.getString("ProductID");
				String store = rs.getString("StoreID");
				list.add(0, id);
				list.add(1, number);
				list.add(2, product);
				list.add(3, store);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

//    public ArrayList<String> personelsatisgetir(String ad){
//        ArrayList<String> list=new ArrayList<String>();
//        String sorgu="select * from satis where PersonelId=(select PersonelId from personel where PersonelAdi='"+ad+"')";
//        try {
//            sta=con.createStatement();
//            rs=sta.executeQuery(sorgu);
//            
//            while(rs.next()){
//                String id=rs.getString("SatisId");
//                String adet=rs.getString("SatisAdedi");
//                String tarih=rs.getDate("SatisTarihi").toString();
//                String urunid=rs.getString("UrunId");
//                String magazaid=rs.getString("MagazaId");
//                list.add(0,id);
//                list.add(1,adet);
//                list.add(2,tarih);
//                list.add(3,urunid);
//                list.add(4,magazaid);
//            }
//            return list;
//        } catch (SQLException ex) {
//            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }

	public ArrayList<String> listgetcategory() {

		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from category";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String id = rs.getString("CategoryID");
				String nameid = rs.getString("CategoryNameID");
				String sizeid = rs.getString("SizeID");
				String brid = rs.getString("BrandID");
				String patid = rs.getString("PatternID");
				String colid = rs.getString("ColorID");
				String typid = rs.getString("TypeID");

				list.add(0, id);
				list.add(1, nameid);
				list.add(2, sizeid);
				list.add(3, brid);
				list.add(4, patid);
				list.add(5, colid);
				list.add(6, typid);
			}
			return list;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "la get");
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> getproduct() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from product ";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String id = rs.getString("ProductID");
				String name = rs.getString("ProductName");
				String price = rs.getString("ProductPrice");
				String categoryid = rs.getString("CategoryID");
				String barcode = rs.getString("Barcode");
				list.add(0, id);
				list.add(1, name);
				list.add(2, price);
				list.add(3, categoryid);
				list.add(4, barcode);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public ArrayList<String> listgetpersonnel() {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from personnel";
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(query);

			while (rs.next()) {
				String id = rs.getString("PersonnelID");
				String name = rs.getString("PersonnelName");
				String surname = rs.getString("PersonnelSurname");
				String phone = rs.getString("PersonnelPhoneNum");
				String address = rs.getString("PersonnelAddress");
				String date = rs.getDate("EntryDate").toString();
				String sal = rs.getString("Salary");
				String depid = rs.getString("DepartmentID");
				String posid = rs.getString("PositionID");
				String storid = rs.getString("StoreID");

				list.add(0, id);
				list.add(1, name);
				list.add(2, surname);
				list.add(3, phone);
				list.add(4, address);
				list.add(5, date);
				list.add(6, sal);
				list.add(7, depid);
				list.add(8, posid);
				list.add(9, storid);
			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

//    public void stokekle(String adet,String barkod,String fiyat, String kategori, String renk,String desen,String marka, String beden, String tip){
//        String sorgu="insert into urun (UrunAdi,UrunFiyati,KategoriId,Barkod) values (?,?,(select distinct KategoriId from kategori where KategoriAdId=? and BedenId=? and MarkaId=? and DesenId=? and RenkId=? and TipId=?),?)";
//        try {
//            psta=con.prepareStatement(sorgu);
//            psta.setString(1, ad);
//            psta.setString(2, fiyat);
//            psta.setString(3, kategori);
//            psta.setString(4, beden);
//            psta.setString(5, marka);
//            psta.setString(6, desen);
//            psta.setString(7, renk);
//            psta.setString(8, tip);
//            psta.setString(9, barkod);
//            psta.executeUpdate();
//            JOptionPane.showMessageDialog(null,"urun Eklenmiştir");
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

	public void adduser(String name, String pass, String aut, String person) {
		String query = "insert into user (UserName,Password,Authorization,PersonnelID) values (?,?,?,(select PersonnelID from personnel where PersonnelName=?))";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.setString(2, pass);
			psta.setString(3, aut);
			psta.setString(4, person);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "user added");

		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void addstore(String name, String department, String city, String phone, String address) {
		String query = "insert into store (BranchName,StorePhoneNumber,StoreAddress,City,DepartmentID) values (?,?,?,?,(select DepartmentID from department where DepartmentName=?))";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.setString(2, phone);
			psta.setString(3, address);
			psta.setString(4, city);
			psta.setString(5, department);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "store added");

		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void adddepartment(String name) {
		String query = "insert into department (DepartmentName) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "department added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void addposition(String name) {
		String query = "insert into position (PositionName) values (?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
			JOptionPane.showMessageDialog(null, "position added");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

//    public int yetkisorgula(String ad,String password){
//        String sorgu="Select Yetki from kullanici where KullaniciAdi="+ad+"' and Sifre='"+password+"'";
//        try {
//            psta=con.prepareStatement(sorgu);
//            psta.setString(1, ad);
//            psta.setString(2, password);
//            
//            ResultSet rs=psta.executeQuery();
//            if(rs.next()){
//                int yetki=rs.getInt("Yetki");
//                if(yetki==1){
//                    yet=1;
//                }
//                else if(yetki==2){
//                    yet=2;
//                }
//            }
//            return yet;
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
//            return 0;
//        }
//    }

	/**
	 * @param args the command line arguments
	 */

	public ArrayList<String> searchuser(String name) {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from user where UserName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			rs = psta.executeQuery();
			while (rs.next()) {
				String id = rs.getString("UserID");
				String NAME = rs.getString("UserName");
				String password = rs.getString("Password");
				String aut = rs.getString("Authorization");
				list.add(0, id);
				list.add(1, NAME);
				list.add(2, password);
				list.add(3, aut);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}

	}

	public ArrayList<String> searchbranch(String name) {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from store where BranchName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			rs = psta.executeQuery();
			while (rs.next()) {
				String id = rs.getString("StoreID");
				String nam = rs.getString("BranchName");
				String phone = rs.getString("StorePhoneNumber");
				String address = rs.getString("StoreAddress");
				String city = rs.getString("City");
				list.add(0, id);
				list.add(1, nam);
				list.add(2, phone);
				list.add(3, address);
				list.add(4, city);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}

	}

	public ArrayList<String> deparama(String name) {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from department where DepartmentName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			rs = psta.executeQuery();
			while (rs.next()) {
				String id = rs.getString("DepartmentID");
				String nam = rs.getString("DepartmentName");
				list.add(0, id);
				list.add(1, nam);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}

	}

	public ArrayList<String> mesarama(String name) {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from position where PositionName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			rs = psta.executeQuery();
			while (rs.next()) {
				String id = rs.getString("PositionID");
				String nam = rs.getString("PositionName");
				list.add(0, id);
				list.add(1, nam);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}

	}

	public ArrayList<String> searchproduct(String name) {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from product where Barcode=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			rs = psta.executeQuery();
			while (rs.next()) {
				String id = rs.getString("ProductID");
				String nam = rs.getString("ProductName");
				String price = rs.getString("ProductPrice");
				String catid = rs.getString("CategoryID");
				String barcode = rs.getString("Barcode");
				list.add(0, id);
				list.add(1, nam);
				list.add(2, price);
				list.add(3, catid);
				list.add(4, barcode);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}

	}

	public ArrayList<String> searchper(String name, String surname) {
		ArrayList<String> list = new ArrayList<String>();
		String query = "select * from personnel where PersonnelName=? and PersonnelSurname=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.setString(2, surname);
			rs = psta.executeQuery();
			while (rs.next()) {
				String id = rs.getString("PersonnelID");
				String nam = rs.getString("PersonnelName");
				String surn = rs.getString("PersonnelSurname");
				String phone = rs.getString("PersonnelPhoneNum");
				String address = rs.getString("PersonnelAddress");
				String date = rs.getDate("EntryDate").toString();
				String salary = rs.getString("Salary");
				String depid = rs.getString("DepartmentID");
				String posid = rs.getString("PositionID");
				String stoid = rs.getString("StoreID");
				list.add(0, id);
				list.add(1, nam);
				list.add(2, surn);
				list.add(3, phone);
				list.add(4, address);
				list.add(5, date);
				list.add(6, salary);
				list.add(7, depid);
				list.add(8, posid);
				list.add(9, stoid);

			}
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}

	}

	public void removeuser(String id) {
		String query = "delete from user where UserID=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removestock(String id) {
		String query = "delete from stock where ProductID=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removestore(String id) {
		String query = "delete from store where StoreID='" + id + "'";
		try {
			psta = con.prepareStatement(query);
			// psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removeposition(String id) {
		String query = "delete from position where PositionID=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removedep(String id) {
		String query = "delete from department where DepartmentID=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removeproduct(String id) {
		String query = "delete from product where ProductID=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removeper(String id) {
		String query = "delete from personnel where PersonnelID=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removecategory(String id) {
		String query = "delete from category where CategoryID=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, id);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removecatname(String name) {
		String query = "delete from catergoryname where CategoryNames=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removepattern(String name) {
		String query = "delete from pattern where PatternName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removecolor(String name) {
		String query = "delete from color where ColorCode=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removebrand(String name) {
		String query = "delete from brand where BrandName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removesize(String name) {
		String query = "delete from size where SizeName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void removetype(String name) {
		String query = "delete from type where TypeName=?";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, name);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void decreasestock(String barcode, String number) {
		String query = "update stock set StockNumber=StockNumber-? where ProductID=(select ProductID from product where Barcode=?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, number);
			psta.setString(2, barcode);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void increasestock(String barcode, String number) {
		String query = "update stock set StockNumber=StockNumber+? where ProductID=(select ProductID from product where Barcode=?)";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, number);
			psta.setString(2, barcode);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void addsales(String barcode, String date, String number) {
		login lgn = new login();
		String unm = lgn.txtKadi.getText();
		String query = "insert into sales (SalesNumber,SalesDate,ProductID,StoreID,PersonnelID) values (?,?,(select ProductID from product where Barcode=?),(select StoreID from personnel where PersonnelID=(select PersonnelID from user where UserName='yasin')),(select PersonnelID from user where UserName='yasin'))";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, number);
			psta.setString(2, date);
			psta.setString(3, barcode);
//            psta.setString(4, unm);
//            psta.setString(5, unm);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void addbill(String barcode) {
		String query = "insert into bill (SalesID) values ((select SalesID from sales where ProductID=(select ProductID from product where Barcode=?))) ";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, barcode);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void addstock(String stocknumber, String name, String store) {

		String query = "insert into stock (StockNumber,ProductID,StoreID) values (?,(select ProductId from product where ProductName=? ),(select StoreID from store where BranchName=?))";
		try {
			psta = con.prepareStatement(query);
			psta.setString(1, stocknumber);
			psta.setString(2, name);
			psta.setString(3, store);
			psta.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void main(String[] args) {
		// TODO code application logic here
		login lgn = new login();
		lgn.setVisible(true);
		lgn.setLocationRelativeTo(null);
	}

	public Storemodule() {
		String url = "jdbc:mysql://" + db.host + ":" + db.port + "/" + db.db_name;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, db.id, db.password);
			System.out.println("database connected");
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("driver did not run");
		} catch (SQLException ex) {
			Logger.getLogger(Storemodule.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("connection did not run");
		}

	}

}
