package dl.iitu.kz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Action implements InterfaceCurrency {

  private double courseRUB;
  private double courseUSD;
  private double courseEUR;
  private  double courseKZT;
    @Override
    public void Kzt(double KZT) {
      double RUB = 0.18;
      double USD = 0.0024;
      double EUR = 0.002;
      this.courseEUR = KZT * EUR;
      this.courseUSD = KZT * USD;
      this.courseRUB = KZT * RUB;
    System.out.println(courseEUR + "€");
    System.out.println(courseRUB + "\u20BD");
    System.out.println(courseUSD + "$");
    }
  @Override
    public void Rub(double RUB) {
     double KZt = 5.68;
     double USd = 0.014;
     double EUr = 0.011;
      this.courseEUR = RUB * EUr;
      this.courseUSD = RUB * USd;
      this.courseKZT = RUB * KZt;
    System.out.println(courseEUR + "€");
    System.out.println(courseKZT+ "₸");
    System.out.println(courseUSD + "$" );
}
  @Override
  public void Eur(double EUR) {
    double KZtt = 489.89;
    double USdd = 1.2;
    double RUBb = 87.8;
    this.courseEUR = EUR * RUBb;
    this.courseUSD = EUR * USdd;
    this.courseKZT = EUR * KZtt;
    System.out.println(courseRUB + "\u20BD");
    System.out.println(courseKZT + "₸");
    System.out.println(courseUSD + "$");
  }
  @Override
  public void Usd(double USD) {
    double KZt = 418.64;
    double rub = 73.51;
    double EUr = 0.84;
    this.courseEUR = USD * EUr;
    this.courseRUB = USD * rub;
    this.courseKZT = USD * KZt;
    System.out.println(courseEUR + "€");
    System.out.println(courseKZT + "₸");
    System.out.println(courseRUB + "\u20BD");
  }
}

