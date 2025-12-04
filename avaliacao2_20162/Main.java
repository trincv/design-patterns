package avaliacao2_20162;

import avaliacao2_20162.q1.abstracoes.IComponent;
import avaliacao2_20162.q1.abstracoes.IVideo;
import avaliacao2_20162.q1.codecs.Codec1;
import avaliacao2_20162.q1.propagandas.PropagandaAntes;
import avaliacao2_20162.q1.propagandas.PropagandaDepois;
import avaliacao2_20162.q1.videos.Video1;

public class Main {

    public static void q1() {
        IVideo video1 = new Video1();
        video1.setCodec(new Codec1());
        IComponent videoComPropaganda = new PropagandaAntes(new PropagandaDepois( (IComponent) video1));
        videoComPropaganda.play();
    }

    public static void main(String[] args) {
        q1();
    }
}
