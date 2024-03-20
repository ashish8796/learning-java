package designPattern.structuralDesignPattern.FacadeDesignPattern.assignment.FacadeBooking;

import designPattern.structuralDesignPattern.FacadeDesignPattern.assignment.FacadeBooking.model.BookingResult;
import designPattern.structuralDesignPattern.FacadeDesignPattern.assignment.FacadeBooking.service.*;

import java.time.LocalDate;

public class BookingManager {
    private BookingFacade bookingFacade;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        bookingFacade = new BookingFacade(availabilityService, paymentService, notificationService,loyaltyService, accommodationDetailsService);
    }

    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        return bookingFacade.bookAccommodation(userId, accommodationId, checkInDate, checkOutDate);
    }
}
