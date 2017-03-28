/**
 * 
 */
package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.TrangDangNhapVaBanHangForm;
import model.bean.TaiSan;
import model.bo.NguoiDungBO;
import model.bo.TaiSanBO;

/**
 * @author keeps
 *
 */
public class TrangDangNhapVaBanHangAction extends Action {
	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// phan dang nhap vao he thong
		TrangDangNhapVaBanHangForm trangDangNhapVaBanHangForm = (TrangDangNhapVaBanHangForm) form;
		String taiKhoan = trangDangNhapVaBanHangForm.getTaiKhoan();
		String matKhau = trangDangNhapVaBanHangForm.getMatKhau();
		System.out.println(taiKhoan + matKhau);
		NguoiDungBO nguoiDungBO = new NguoiDungBO();
		if("Dang nhap".equals(trangDangNhapVaBanHangForm.getSubmit())) {
			if(nguoiDungBO.checkLogin(taiKhoan, matKhau)) {
				System.out.println("Login successful!!");
				return mapping.findForward("trangadmin");
			} else {
				return mapping.findForward("trangchu");
			}
		} 
		
		// hien thi danh sach tai san thanh ly
		ArrayList<TaiSan> danhSachTaiSan = new ArrayList<>();
		TaiSanBO taiSanBO = new TaiSanBO();
		danhSachTaiSan = taiSanBO.hienThiDanhSachTaiSan();
		trangDangNhapVaBanHangForm.setDanhSachTaiSan(danhSachTaiSan);
		return mapping.getInputForward();
	}
}
