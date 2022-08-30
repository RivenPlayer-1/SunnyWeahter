package com.sunnyweahter.android.ui.weather

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweahter.android.logic.Repository
import com.sunnyweahter.android.logic.model.Location

class WeatherViewModel : ViewModel() {
    private val locationData = MutableLiveData<Location>()

    var locationLng = ""
    var locationLat = ""
    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationData){ location ->
        Repository.refreshWeather(location.lng, location.lat)
    }

    fun refreshWeather(lng : String, lat : String){
        locationData.value = Location(lng, lat)
    }
}