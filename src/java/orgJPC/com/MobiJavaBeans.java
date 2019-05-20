package orgJPC.com;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@RequestScoped
public class MobiJavaBeans {
int num1=0;
int num2=0;
int sum=0;
int res=0;
int mul=0;
float div;
public MobiJavaBeans() {
}
public int getNum1() {
return num1;
}
public void setNum1(int num1) {
this.num1 = num1;
}
public int getNum2() {
return num2;
}
public void setNum2(int num2) {
this.num2 = num2;
}
public int getSuma() {
return sum;
}
public void setSuma(int sum) {
this.sum = sum;
}
public int getResta() {
return res;
}
public void setResta(int res) {
this.res = res;
}
public int getMulti() {
return mul;
}
public void setMulti(int mul) {
this.mul = mul;
}
public float getDiv() {
return div;
}
public void setDiv(float  div) {
this.div = div;
}
public void operaciones(){
    sum = num1 + num2;
    res = num1 - num2;
    mul = num1 * num2;
    div = num1 / num2;
FacesContext c = FacesContext.getCurrentInstance();
c.addMessage(null, new FacesMessage("***OPERACIONES***","1) Suma: " +sum+ "\n"+" ||  2) Resta: "+res+" ||  3) Multiplicacion: "+mul+"               ||  4) Division:"+div));
}
}