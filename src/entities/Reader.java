
package entities;


public class Reader {
    
    private String fio;
    private String address;
    private long phone;
    
    public Reader()
    {
        
    }
    
    public Reader(String fio, String address, long phone)
    {
        this.fio = fio;
        this.address = address;
        this.phone = phone;
    }
    
    @Override
    public String toString()
    {
        return fio + ", адрес " + address + ", телефон: " + getPhone();
    }
    
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

  
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public long getPhone() {
        return phone;
    }

   
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
}
