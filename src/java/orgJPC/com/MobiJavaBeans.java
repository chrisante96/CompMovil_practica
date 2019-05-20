package orgJPC.com;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@RequestScoped
public class MobiJavaBeans {
int n1;
int n2;
int s;
int r;
int m;
float d;
public MobiJavaBeans() {
}
public void sumar(){
s = n1 + n2;
FacesContext c = FacesContext.getCurrentInstance();
c.addMessage(null, new FacesMessage("Calculadora","La suma= "+s));
}
public void resta(){
r = n1 - n2;
FacesContext c = FacesContext.getCurrentInstance();
c.addMessage(null, new FacesMessage("Calculadora","La resta= "+r));
}

public void multiplicacion(){
m = n1 * n2;
FacesContext c = FacesContext.getCurrentInstance();
c.addMessage(null, new FacesMessage("Calculadora","multiplicacion= "+m));
}

public void divicion(){
d = n1 / n2;
FacesContext c = FacesContext.getCurrentInstance();
c.addMessage(null, new FacesMessage("Calculadora","divicion= "+d));
}
public int getN1() {
return n1;
}
public void setN1(int n1) {
this.n1 = n1;
}
public int getN2() {
return n2;
}
public void setN2(int n2) {
this.n2 = n2;
}
public int getSuma() {
return s;
}
public void setSumao(int s) {
this.s = s;
}
public int getResta() {
return r;
}
public void setResta(int r) {
this.r = r;
}
public int getMultipicacion() {
return m;
}
public void setMultipicacion(int m) {
this.m = m;
}
public float getDivicion() {
return d;
}
public void setDivicion(float d) {
this.d = d;
}
}