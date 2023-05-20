package tw.edu.pu.myapplication;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Place {
    private long id;

    private double latitude;
    private double longitude;
    private double accuracy;
    private String datetime;
    private String note;

    public Place(){

    }
    public Place(long id, double latitude, double longitude, double accuracy, String datetime, String note) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.accuracy = accuracy;
        this.datetime = datetime;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", accuracy=" + accuracy +
                ", datetime='" + datetime + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    //    public Place() {
//
//    }
//
//    public Place(long id, double latitude, double longitude, double accuracy, String datatime, String note) {
//        this.id = id;
//        this.latitude = latitude;
//        this.longitude = longitude;
//        this.accuracy = accuracy;
//        this.datetime = datatime;
//        this.note = note;
//    }
//
//    public long getId() {
//        return id;
//    }
//    public void setId(long id){
//        this.id=id;
//    }
//    public double getLatitude(){
//        return latitude;
//    }
//    public void setLatitude(double latitude){
//        this.latitude=latitude;
//    }
//
//    public double getLongitude(){
//        return longitude;
//    }
//    public void setLongitude(double longitude){
//        this.longitude=longitude;
//    }
//    public double getAccuracy(){
//        return accuracy;
//    }
//    public void setAccuracy(double accuracy){
//        this.accuracy=accuracy;
//    }
//    public String getDatetime(){
//        return datetime;
//    }
//    public String setDatetime(String datetime){
//        this.datetime=datetime;
//        return datetime;
//    }
//    public String getNote(){
//        return note;
//    }
//    public void setNote(String note){
//        this.note=note;
//    }
//    public void setDatetime(long now){
//        Date date=new Date(now);
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        datetime=sdf.format(date);
//    }
}
