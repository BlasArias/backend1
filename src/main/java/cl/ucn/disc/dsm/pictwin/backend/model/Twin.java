package cl.ucn.disc.dsm.pictwin.backend.model;

	import com.fasterxml.jackson.annotation.JsonBackReference;
	import jakarta.persistence.*;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;


@Entity
@Builder
@Table(name = "twins")
@NoArgsConstructor
@AllArgsConstructor
public final class Twin  {

    /**
     *
     *The Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long Id;
    /**
     *
     *The dislike
     */
    @Getter
    @Setter
    @Builder.Default
    private Boolean dislike = Boolean.FALSE;
    /**
     *
     *The pic my
     */
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @Getter
    private Pic my;
    /**
     *
     *The pic yours
     */
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @Getter
    private Pic yours;

    @ManyToOne(optional = false, fetch=FetchType.EAGER) @Getter
    @JsonBackReference
    private User owner;


}
