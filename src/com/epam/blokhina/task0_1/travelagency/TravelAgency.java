package com.epam.blokhina.task0_1.travelagency;

import com.epam.blokhina.task0_1.travelagency.deals.Country;
import com.epam.blokhina.task0_1.travelagency.deals.Deal;
import com.epam.blokhina.task0_1.travelagency.deals.Transports;
import com.epam.blokhina.task0_1.travelagency.deals.impl.DealType;

import java.util.*;

/**
 * Created by jecka on 26.04.2015.
 */
public class TravelAgency {
    SortField sortField;
    boolean asc;
    int minPrice;
    int maxPrice;
    Transports transportFilter;
    DealType typeFilter;

    List<Deal> proposals;

    public TravelAgency(List<Deal> proposals) {
        this.proposals = proposals;
        minPrice = 0;
        maxPrice = Integer.MAX_VALUE;
    }

    public Transports getTransportFilter() {
        return transportFilter;
    }

    public void setTransportFilter(Transports transportFilter) {
        this.transportFilter = transportFilter;
    }

    public SortField getSortField() {
        return sortField;
    }

    public void setSortField(SortField sortField) {
        this.sortField = sortField;
    }

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public List<Deal> getProposals() {
        return proposals;
    }

    public void setProposals(List<Deal> proposals) {
        this.proposals = proposals;
    }

    public DealType getTypeFilter() {
        return typeFilter;
    }

    public void setTypeFilter(DealType typeFilter) {
        this.typeFilter = typeFilter;
    }

    public List<Deal> findAppropriateDeals() {
        List<Deal> appropriateProposals = new ArrayList<>();
        appropriateProposals.addAll(proposals);
        filter(appropriateProposals);
        sort(appropriateProposals);
        return appropriateProposals;
    }

    private void filter(List<Deal> appropriateProposals) {
        Iterator<Deal> iterator = appropriateProposals.iterator();
        while (iterator.hasNext()) {
            Deal next = iterator.next();
            if (!isAppropriate(next)) {
                iterator.remove();
            }
        }
    }

    private boolean isAppropriate(Deal next) {
        boolean result = next.getPrice() < maxPrice
                || next.getPrice() > minPrice;
        if (transportFilter != null) {
            result = result && next.getTransport().equals(transportFilter);
        }
        if (typeFilter != null) {
            result = result && next.getType().equals(typeFilter);
        }
        return result;
    }

    private void sort(List<Deal> appropriateProposals) {
        if (sortField == null || sortField.equals(SortField.PRICE)) {
            Collections.sort(appropriateProposals, new Comparator<Deal>() {
                @Override
                public int compare(Deal o1, Deal o2) {
                    if (asc) {
                        return Double.compare(o1.getPrice(), o2.getPrice());
                    } else {
                        return Double.compare(o2.getPrice(), o1.getPrice());
                    }
                }
            });
        } else if (sortField.equals(SortField.COUNTRY)) {
            Collections.sort(appropriateProposals, new Comparator<Deal>() {
                @Override
                public int compare(Deal o1, Deal o2) {
                    if (asc) {
                        return o1.getDestination().compareTo(o2.getDestination());
                    } else {
                        return o2.getDestination().compareTo(o1.getDestination());
                    }
                }
            });
        }
    }
}
