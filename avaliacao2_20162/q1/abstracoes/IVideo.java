package avaliacao2_20162.q1.abstracoes;

public abstract class IVideo implements IComponent {

    protected ICodec codec;

    public void setCodec(ICodec codec) {
        this.codec = codec;
    }
    
} 
