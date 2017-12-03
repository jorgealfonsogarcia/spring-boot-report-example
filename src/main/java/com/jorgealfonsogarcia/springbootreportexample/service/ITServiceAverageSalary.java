/*
 * MIT License
 * 
 * Copyright (c) 2017 Jorge Alfonso García Espinosa
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package com.jorgealfonsogarcia.springbootreportexample.service;

/**
 * Average Salary for Industry: Information Technology (IT) Services.
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 12/03/2017
 */
public class ITServiceAverageSalary {

    private final String job;
    private final double averageSalary;

    /**
     * Constructor.
     *
     * @param job Job.
     * @param averageSalary Average salary.
     */
    public ITServiceAverageSalary(String job, double averageSalary) {
        this.job = job;
        this.averageSalary = averageSalary;
    }

    /**
     * Gets the job name.
     *
     * @return Job name.
     */
    public String getJob() {
        return job;
    }

    /**
     * Gets the average salary.
     *
     * @return Average salary.
     */
    public double getAverageSalary() {
        return averageSalary;
    }

}
