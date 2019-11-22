package com.highfi.sys.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.util.Comparator.comparing;

public class PriorityHelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = comparing(Enquiry::getCategory);

    private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off and on again? ");
        }
    }


    public static void main(String[] args) {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARRY, Category.COMPUTER);

        helpDesk.processAllEnquiries();
    }
}
