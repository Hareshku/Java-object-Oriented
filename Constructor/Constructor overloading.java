class R{
String Id,name,dept,Sec,Uni;
R(String g, String l,String n){
Id=g;
name=l;
dept=n;
System.out.println(Id);
System.out.println(name);
System.out.println(dept);
}
R(String i,String c,String d,String f,String s){
Id=i;
name=c;
dept=d;
Sec=f;
Uni=s;
System.out.println(Id);
System.out.println(name);
System.out.println(dept);
System.out.println(Sec);
System.out.println(Uni);
}
public static void main(String[] args){
R d1=new R("21sw012","Fahad","SW");
R s1=new R("21sw053","Haresh","SW","(ii)","Mehran University");
R s2=new R("21sw052","Sohal","SW","(ii)","Mehran University");
R s3=new R("21sw051","Suresh","SW","(ii)","Mehran University");
R s4=new R("21sw056","Mukesh","SW","(ii)","Mehran University");
R s5=new R("21sw050","Ramesh","SW","(ii)","Mehran University");
R s6=new R("21sw059","Ali","SW","(ii)","Mehran University");
R s7=new R("21sw057","Ahmed","SW","(ii)","Mehran University");
R s8=new R("21sw054","Babar","SW","(ii)","Mehran University");
}
}
