package com.lohika.morning.ml.api.dao;

import lombok.Getter;
import lombok.Setter;


public class PredictionResponse {

    @Getter @Setter private String genre;

    @Getter @Setter private float metalProbability;

    @Getter @Setter private float popProbability;

}
