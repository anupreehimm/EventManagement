package manage.eventmanage;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Events {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eveId;
	private String eveName;
	@Nullable
	//"manoj, annamalai">> getEveParts()+","+object>> setEvePart(str)
	private String eveParts;
	@Nullable
	private String eveWinner;
	@Temporal(TemporalType.DATE)
	private Date eveDate;
	private String eveLocation;
}
