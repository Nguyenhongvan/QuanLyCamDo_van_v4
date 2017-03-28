/**
 * 
 */
package model.bean;

/**
 * @author HCD-Fresher163
 *
 */
public class TaiSan {
	private int maTaiSan;
	private int maLoaiTaiSan;
	private String tenTaiSan;
	private int tinhTrang;
	private String urlHinhAnh;
	private String moTa;
	
	public TaiSan() {
		super();
	}

	/**
	 * 
	 * @param maTaiSan
	 * @param maLoaiTaiSan
	 * @param tenTaiSan
	 * @param tinhTrang
	 * @param urlHinhAnh
	 * @param moTa
	 */
	public TaiSan(int maTaiSan, int maLoaiTaiSan, String tenTaiSan, int tinhTrang, 
		String urlHinhAnh, String moTa) {
		super();
		this.maTaiSan = maTaiSan;
		this.maLoaiTaiSan = maLoaiTaiSan;
		this.tenTaiSan = tenTaiSan;
		this.tinhTrang = tinhTrang;
		this.urlHinhAnh = urlHinhAnh;
		this.moTa = moTa;
	}

	/**
	 * 
	 * @return int
	 */
	public int getMaTaiSan() {
		return maTaiSan;
	}

	/**
	 * 
	 * @param maTaiSan
	 */
	public void setMaTaiSan(int maTaiSan) {
		this.maTaiSan = maTaiSan;
	}

	/**
	 * 
	 * @return int
	 */
	public int getMaLoaiTaiSan() {
		return maLoaiTaiSan;
	}

	/**
	 * 
	 * @param maLoaiTaiSan
	 */
	public void setMaLoaiTaiSan(int maLoaiTaiSan) {
		this.maLoaiTaiSan = maLoaiTaiSan;
	}

	/**
	 * 
	 * @return String
	 */
	public String getTenTaiSan() {
		return tenTaiSan;
	}

	/**
	 * 
	 * @param tenTaiSan
	 */
	public void setTenTaiSan(String tenTaiSan) {
		this.tenTaiSan = tenTaiSan;
	}

	/**
	 * 
	 * @return int
	 */
	public int getTinhTrang() {
		return tinhTrang;
	}

	/**
	 * 
	 * @param tinhTrang
	 */
	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	/**
	 * 
	 * @return String
	 */
	public String getUrlHinhAnh() {
		return urlHinhAnh;
	}

	/**
	 * 
	 * @param urlHinhAnh
	 */
	public void setUrlHinhAnh(String urlHinhAnh) {
		this.urlHinhAnh = urlHinhAnh;
	}

	/**
	 * 
	 * @return String
	 */
	public String getMoTa() {
		return moTa;
	}

	/**
	 * 
	 * @param moTa
	 */
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
}
