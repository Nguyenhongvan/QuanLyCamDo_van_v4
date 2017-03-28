/**
 * 
 */
package model.bo;

import java.util.ArrayList;

import model.bean.TaiSan;
import model.dao.TaiSanDAO;

/**
 * @author HCD-Fresher163
 *
 */
public class TaiSanBO {
	TaiSanDAO taiSanDAO = new TaiSanDAO();
	
	public ArrayList<TaiSan> hienThiDanhSachTaiSan() {
		return taiSanDAO.hienThiDanhSachTaiSan();
	}
}
