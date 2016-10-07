package com.proyect.perceptron.manage.weight.recalculator;

import com.proyect.perceptron.domain.Input;
import com.proyect.perceptron.domain.Output;

public interface IWeightRecalculatorStrategy {

	double calculate(Input input, double salidaNeurona, Output output);

}
