package model.bean;

public class LoaiTaiSan {
	private int maLoaiTaiSan;
	private String tenLoaiTaiSan;

	public LoaiTaiSan() {
		super();
	}
	/**
	 * 
	 * @param maLoaiTaiSan
	 * @param tenLoaiTaiSan
	 */
	public LoaiTaiSan(int maLoaiTaiSan, String tenLoaiTaiSan) {
		super();
		this.maLoaiTaiSan = maLoaiTaiSan;
		this.tenLoaiTaiSan = tenLoaiTaiSan;
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
	public String getTenLoaiTaiSan() {
		return tenLoaiTaiSan;
	}
	
	/**
	 * 
	 * @param tenLoaiTaiSan
	 */
	public void setTenLoaiTaiSan(String tenLoaiTaiSan) {
		this.tenLoaiTaiSan = tenLoaiTaiSan;
	}
}
