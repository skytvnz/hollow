package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

@SuppressWarnings("all")
public class CharacterArtworkHollow extends HollowObject {

    public CharacterArtworkHollow(CharacterArtworkDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public long _getCharacterId() {
        return delegate().getCharacterId(ordinal);
    }

    public Long _getCharacterIdBoxed() {
        return delegate().getCharacterIdBoxed(ordinal);
    }

    public StringHollow _getSourceFileId() {
        int refOrdinal = delegate().getSourceFileIdOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public long _getSeqNum() {
        return delegate().getSeqNum(ordinal);
    }

    public Long _getSeqNumBoxed() {
        return delegate().getSeqNumBoxed(ordinal);
    }

    public ArtworkDerivativeSetHollow _getDerivatives() {
        int refOrdinal = delegate().getDerivativesOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getArtworkDerivativeSetHollow(refOrdinal);
    }

    public ArtworkLocaleListHollow _getLocales() {
        int refOrdinal = delegate().getLocalesOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getArtworkLocaleListHollow(refOrdinal);
    }

    public ArtworkAttributesHollow _getAttributes() {
        int refOrdinal = delegate().getAttributesOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getArtworkAttributesHollow(refOrdinal);
    }

    public long _getOrdinalPriority() {
        return delegate().getOrdinalPriority(ordinal);
    }

    public Long _getOrdinalPriorityBoxed() {
        return delegate().getOrdinalPriorityBoxed(ordinal);
    }

    public StringHollow _getFileImageType() {
        int refOrdinal = delegate().getFileImageTypeOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public VMSHollowInputAPI api() {
        return typeApi().getAPI();
    }

    public CharacterArtworkTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected CharacterArtworkDelegate delegate() {
        return (CharacterArtworkDelegate)delegate;
    }

}