package tr.gov.ua.obs.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Ogrenci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long ogrenciNo;
    private String ad;
    private String soyad;
    private String tur; // TM - MF
    private double harc;

    @OneToMany(mappedBy = "ogrenci", cascade = CascadeType.ALL)
    private List<Dolap> dolaplar = new ArrayList<>();

    public void setHarc(double harc) {
        if (harc >= 0)
           this.harc = harc;
    }
}
