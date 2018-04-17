package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.HollowObject;
import com.netflix.hollow.core.schema.HollowObjectSchema;

import com.netflix.hollow.tools.stringifier.HollowRecordStringifier;

@SuppressWarnings("all")
public class FeedMovieCountryLanguagesHollow extends HollowObject {

    public FeedMovieCountryLanguagesHollow(FeedMovieCountryLanguagesDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public LongHollow _getMovieId() {
        int refOrdinal = delegate().getMovieIdOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getLongHollow(refOrdinal);
    }

    public StringHollow _getCountryCode() {
        int refOrdinal = delegate().getCountryCodeOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public StringHollow _getLanguageCode() {
        int refOrdinal = delegate().getLanguageCodeOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public LongHollow _getEarliestWindowStartDate() {
        int refOrdinal = delegate().getEarliestWindowStartDateOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getLongHollow(refOrdinal);
    }

    public VMSHollowInputAPI api() {
        return typeApi().getAPI();
    }

    public FeedMovieCountryLanguagesTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected FeedMovieCountryLanguagesDelegate delegate() {
        return (FeedMovieCountryLanguagesDelegate)delegate;
    }

}