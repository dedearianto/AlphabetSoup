import java.util.Objects;

public class DataHold {

    int number;
    String strOld;
    String strNew;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStrOld() {
        return strOld;
    }

    public void setStrOld(String strOld) {
        this.strOld = strOld;
    }

    public String getStrNew() {
        return strNew;
    }

    public void setStrNew(String strNew) {
        this.strNew = strNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataHold dataHold = (DataHold) o;
        return number == dataHold.number && strOld.equals(dataHold.strOld) && strNew.equals(dataHold.strNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, strOld, strNew);
    }

    @Override
    public String toString() {
        return "DataHold{" +
                "number=" + number +
                ", strOld='" + strOld + '\'' +
                ", strNew='" + strNew + '\'' +
                '}';
    }
}
