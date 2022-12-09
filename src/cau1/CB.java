package cau1;

public class CB {
    private String trangThai;

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public CB(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "CB{" +
                "trangThai='" + trangThai + '\'' +
                '}';
    }

    public void sendRequest(){
        if(trangThai.equalsIgnoreCase("OPEN")){
            System.out.println("Không thể gửi request vì đang OPEN");
        }
    }

    public void checkStatus(){
        if(trangThai.equalsIgnoreCase("OPEN")){
            System.out.println("OPEN");
        }
        if(trangThai.equalsIgnoreCase("HAFTOPEN")){
            System.out.println("HAFTOPEN");
        }
        if(trangThai.equalsIgnoreCase("CLOSE")){
            System.out.println("CLOSE");
        }
    }
}
