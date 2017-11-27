package vn.sotaytiemchung.models.dto;

import java.util.Date;

public class NguoiDung {
	String id;
	String ten;
	String soDienThoai;
	String email;
	Date ngaySinh;
	int canNang;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getCanNang() {
		return canNang;
	}
	public void setCanNang(int canNang) {
		this.canNang = canNang;
	}
	
}
