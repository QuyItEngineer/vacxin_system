package vn.sotaytiemchung.models.dto;

public class Vaccine {
	String id;
	String ten;
	float giaBan;
	String congDung;
	String chiDinh;
	String luuY;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}
	public String getCongDung() {
		return congDung;
	}
	public void setCongDung(String congDung) {
		this.congDung = congDung;
	}
	public String getChiDinh() {
		return chiDinh;
	}
	public void setChiDinh(String chiDinh) {
		this.chiDinh = chiDinh;
	}
	public String getLuuY() {
		return luuY;
	}
	public void setLuuY(String luuY) {
		this.luuY = luuY;
	}
}
