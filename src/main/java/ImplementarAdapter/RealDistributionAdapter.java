/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplementarAdapter;

import java.util.Random;
import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

/**
 *
 * @author aluno
 */
public class RealDistributionAdapter implements Gerador{

    @Override
    public int[] getGerador(int sampleSize) {
        RealDistribution exponentialRandom = new LogNormalDistribution();
        long seed = 0;
        exponentialRandom.reseedRandomGenerator(seed);
        return null;
        
    }
    
    
}
