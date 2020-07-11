package bean;

public class Hoa {
	private int idHoa;
	private String tenHoa;
	private float giaBan;
	private int soLuong;
	public Hoa(int idHoa, String tenHoa, float giaBan, int soLuong) {
		super();
		this.idHoa = idHoa;
		this.tenHoa = tenHoa;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}
	public Hoa() {
		super();
	}
	public int getIdHoa() {
		return idHoa;
	}
	public void setIdHoa(int idHoa) {
		this.idHoa = idHoa;
	}
	public String getTenHoa() {
		return tenHoa;
	}
	public void setTenHoa(String tenHoa) {
		this.tenHoa = tenHoa;
	}
	public float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "Hoa [idHoa=" + idHoa + ", tenHoa=" + tenHoa + ", giaBan=" + giaBan + ", soLuong=" + soLuong + "]";
	}
	
	
}
