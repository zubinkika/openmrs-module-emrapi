package org.openmrs.module.emrapi.encounter;

import org.openmrs.*;
import org.openmrs.module.emrapi.encounter.domain.*;

import java.util.*;

public interface EmrOrderService {
    void save(List<EncounterTransaction.DrugOrder> drugOrders, Encounter encounter);
    void saveTestOrders(List<EncounterTransaction.TestOrder> testOrders, Encounter encounter);
}
