package com.nvinayshetty.prototypeandroid.listing.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by vinayaprasadn on 19/4/17.
 */

public interface ContactListService {
    @GET("contacts")
    Call<List<Contact>> getContacts();
}
