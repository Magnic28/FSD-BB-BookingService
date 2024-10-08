package com.fsd.bookingService.service;

import com.fsd.bookingService.bean.*;
import com.fsd.bookingService.document.BookingDetails;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public interface BookingService {

//    updateBookingDetails
//    cancelbooking
//    updateBookingStatus

    AvailableSlotsResponseBean getAvailableSlots(String vendorId, LocalDate dateTime);
    BookingDetails createBooking(String vendorId, CreateBookingRequestBean createBookingRequestBean, String customerId);
    BookingDetails getBookingDetails(String bookingId);
    CustomerBookingHistoryResponseBean getCustomerBookingHistory(String customerId);
    VendorBookingHistoryResponseBean getVendorBookingHistory(String vendorId);
    BookingDetails removeServiceFormExistingBooking(String bookingId, String vendorId, Long vendorServiceKey);
    VendorBookingHistoryResponseBean getVendorBookingHistoryOnDate(String vendorId, String date);
    BookingDetails cancelBooking(String bookingId);
}