package com.app.assigmenttask.activity.homescreen.model;

import java.util.List;

public class RerestaurantModel {


    private int statusCode;
    private String message;
    private DataDTO data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        private RestaurantsDTO restaurants;

        public RestaurantsDTO getRestaurants() {
            return restaurants;
        }

        public void setRestaurants(RestaurantsDTO restaurants) {
            this.restaurants = restaurants;
        }

        public static class RestaurantsDTO {
            private int currentPage;
            private String firstPageUrl;
            private int from;
            private int lastPage;
            private String lastPageUrl;
            private String nextPageUrl;
            private String path;
            private int perPage;
            private Object prevPageUrl;
            private int to;
            private int total;
            private List<Datam> data;

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public String getFirstPageUrl() {
                return firstPageUrl;
            }

            public void setFirstPageUrl(String firstPageUrl) {
                this.firstPageUrl = firstPageUrl;
            }

            public int getFrom() {
                return from;
            }

            public void setFrom(int from) {
                this.from = from;
            }

            public int getLastPage() {
                return lastPage;
            }

            public void setLastPage(int lastPage) {
                this.lastPage = lastPage;
            }

            public String getLastPageUrl() {
                return lastPageUrl;
            }

            public void setLastPageUrl(String lastPageUrl) {
                this.lastPageUrl = lastPageUrl;
            }

            public String getNextPageUrl() {
                return nextPageUrl;
            }

            public void setNextPageUrl(String nextPageUrl) {
                this.nextPageUrl = nextPageUrl;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getPerPage() {
                return perPage;
            }

            public void setPerPage(int perPage) {
                this.perPage = perPage;
            }

            public Object getPrevPageUrl() {
                return prevPageUrl;
            }

            public void setPrevPageUrl(Object prevPageUrl) {
                this.prevPageUrl = prevPageUrl;
            }

            public int getTo() {
                return to;
            }

            public void setTo(int to) {
                this.to = to;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<Datam> getData() {
                return data;
            }

            public void setData(List<Datam> data) {
                this.data = data;
            }

            public static class Datam {
                private int id;
                private int smokingArea;
                private int userId;
                private String name;
                private Object description;
                private String email;
                private String tel;
                private String address;
                private String city;
                private String region;
                private String zip;
                private int countryId;
                private Object lat;
                private Object lng;
                private String created;
                private String opensAt;
                private String closesAt;
                private Object website;
                private int isActive;
                private int isVerified;
                private String averageRating;
                private int totalReviews;
                private Object avgPrice;
                private String minPrice;
                private String maxPrice;
                private int policyId;
                private int dressCodeId;
                private int venueId;
                private Object cuisineId;
                private Object distance;
                private int priceLength;
                private float propertyAvgRating;
                private LogoDTO logo;
                private String shareurl;
                private DresscodeDTO dresscode;
                private Object vanueType;
                private List<PropertyBookingTimeSlotsDTO> propertyBookingTimeSlots;
                private List<ModifiedWeekdaysDTO> modifiedWeekdays;
                private List<CuisinesDTO> cuisines;
                private List<?> policies;
                private List<ImagesDTO> images;
                private List<?> customerReview;
                private List<RestaurantPropertySeatTypeDTO> restaurantPropertySeatType;
                private List<?> restaurantPropertyFoodType;
                private List<RestaurantPropertyDinnerTypeDTO> restaurantPropertyDinnerType;
                private List<RestaurantPropertyAmenitiesDTO> restaurantPropertyAmenities;
                private List<RestaurantWeekdaysDTO> restaurantWeekdays;
                private List<RestoPropertyPriceDTO> restoPropertyPrice;
                private List<?> restotype;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getSmokingArea() {
                    return smokingArea;
                }

                public void setSmokingArea(int smokingArea) {
                    this.smokingArea = smokingArea;
                }

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Object getDescription() {
                    return description;
                }

                public void setDescription(Object description) {
                    this.description = description;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getTel() {
                    return tel;
                }

                public void setTel(String tel) {
                    this.tel = tel;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getRegion() {
                    return region;
                }

                public void setRegion(String region) {
                    this.region = region;
                }

                public String getZip() {
                    return zip;
                }

                public void setZip(String zip) {
                    this.zip = zip;
                }

                public int getCountryId() {
                    return countryId;
                }

                public void setCountryId(int countryId) {
                    this.countryId = countryId;
                }

                public Object getLat() {
                    return lat;
                }

                public void setLat(Object lat) {
                    this.lat = lat;
                }

                public Object getLng() {
                    return lng;
                }

                public void setLng(Object lng) {
                    this.lng = lng;
                }

                public String getCreated() {
                    return created;
                }

                public void setCreated(String created) {
                    this.created = created;
                }

                public String getOpensAt() {
                    return opensAt;
                }

                public void setOpensAt(String opensAt) {
                    this.opensAt = opensAt;
                }

                public String getClosesAt() {
                    return closesAt;
                }

                public void setClosesAt(String closesAt) {
                    this.closesAt = closesAt;
                }

                public Object getWebsite() {
                    return website;
                }

                public void setWebsite(Object website) {
                    this.website = website;
                }

                public int getIsActive() {
                    return isActive;
                }

                public void setIsActive(int isActive) {
                    this.isActive = isActive;
                }

                public int getIsVerified() {
                    return isVerified;
                }

                public void setIsVerified(int isVerified) {
                    this.isVerified = isVerified;
                }

                public String getAverageRating() {
                    return averageRating;
                }

                public void setAverageRating(String averageRating) {
                    this.averageRating = averageRating;
                }

                public int getTotalReviews() {
                    return totalReviews;
                }

                public void setTotalReviews(int totalReviews) {
                    this.totalReviews = totalReviews;
                }

                public Object getAvgPrice() {
                    return avgPrice;
                }

                public void setAvgPrice(Object avgPrice) {
                    this.avgPrice = avgPrice;
                }

                public String getMinPrice() {
                    return minPrice;
                }

                public void setMinPrice(String minPrice) {
                    this.minPrice = minPrice;
                }

                public String getMaxPrice() {
                    return maxPrice;
                }

                public void setMaxPrice(String maxPrice) {
                    this.maxPrice = maxPrice;
                }

                public int getPolicyId() {
                    return policyId;
                }

                public void setPolicyId(int policyId) {
                    this.policyId = policyId;
                }

                public int getDressCodeId() {
                    return dressCodeId;
                }

                public void setDressCodeId(int dressCodeId) {
                    this.dressCodeId = dressCodeId;
                }

                public int getVenueId() {
                    return venueId;
                }

                public void setVenueId(int venueId) {
                    this.venueId = venueId;
                }

                public Object getCuisineId() {
                    return cuisineId;
                }

                public void setCuisineId(Object cuisineId) {
                    this.cuisineId = cuisineId;
                }

                public Object getDistance() {
                    return distance;
                }

                public void setDistance(Object distance) {
                    this.distance = distance;
                }

                public int getPriceLength() {
                    return priceLength;
                }

                public void setPriceLength(int priceLength) {
                    this.priceLength = priceLength;
                }

                public float getPropertyAvgRating() {
                    return propertyAvgRating;
                }

                public void setPropertyAvgRating(float propertyAvgRating) {
                    this.propertyAvgRating = propertyAvgRating;
                }

                public LogoDTO getLogo() {
                    return logo;
                }

                public void setLogo(LogoDTO logo) {
                    this.logo = logo;
                }

                public String getShareurl() {
                    return shareurl;
                }

                public void setShareurl(String shareurl) {
                    this.shareurl = shareurl;
                }

                public DresscodeDTO getDresscode() {
                    return dresscode;
                }

                public void setDresscode(DresscodeDTO dresscode) {
                    this.dresscode = dresscode;
                }

                public Object getVanueType() {
                    return vanueType;
                }

                public void setVanueType(Object vanueType) {
                    this.vanueType = vanueType;
                }

                public List<PropertyBookingTimeSlotsDTO> getPropertyBookingTimeSlots() {
                    return propertyBookingTimeSlots;
                }

                public void setPropertyBookingTimeSlots(List<PropertyBookingTimeSlotsDTO> propertyBookingTimeSlots) {
                    this.propertyBookingTimeSlots = propertyBookingTimeSlots;
                }

                public List<ModifiedWeekdaysDTO> getModifiedWeekdays() {
                    return modifiedWeekdays;
                }

                public void setModifiedWeekdays(List<ModifiedWeekdaysDTO> modifiedWeekdays) {
                    this.modifiedWeekdays = modifiedWeekdays;
                }

                public List<CuisinesDTO> getCuisines() {
                    return cuisines;
                }

                public void setCuisines(List<CuisinesDTO> cuisines) {
                    this.cuisines = cuisines;
                }

                public List<?> getPolicies() {
                    return policies;
                }

                public void setPolicies(List<?> policies) {
                    this.policies = policies;
                }

                public List<ImagesDTO> getImages() {
                    return images;
                }

                public void setImages(List<ImagesDTO> images) {
                    this.images = images;
                }

                public List<?> getCustomerReview() {
                    return customerReview;
                }

                public void setCustomerReview(List<?> customerReview) {
                    this.customerReview = customerReview;
                }

                public List<RestaurantPropertySeatTypeDTO> getRestaurantPropertySeatType() {
                    return restaurantPropertySeatType;
                }

                public void setRestaurantPropertySeatType(List<RestaurantPropertySeatTypeDTO> restaurantPropertySeatType) {
                    this.restaurantPropertySeatType = restaurantPropertySeatType;
                }

                public List<?> getRestaurantPropertyFoodType() {
                    return restaurantPropertyFoodType;
                }

                public void setRestaurantPropertyFoodType(List<?> restaurantPropertyFoodType) {
                    this.restaurantPropertyFoodType = restaurantPropertyFoodType;
                }

                public List<RestaurantPropertyDinnerTypeDTO> getRestaurantPropertyDinnerType() {
                    return restaurantPropertyDinnerType;
                }

                public void setRestaurantPropertyDinnerType(List<RestaurantPropertyDinnerTypeDTO> restaurantPropertyDinnerType) {
                    this.restaurantPropertyDinnerType = restaurantPropertyDinnerType;
                }

                public List<RestaurantPropertyAmenitiesDTO> getRestaurantPropertyAmenities() {
                    return restaurantPropertyAmenities;
                }

                public void setRestaurantPropertyAmenities(List<RestaurantPropertyAmenitiesDTO> restaurantPropertyAmenities) {
                    this.restaurantPropertyAmenities = restaurantPropertyAmenities;
                }

                public List<RestaurantWeekdaysDTO> getRestaurantWeekdays() {
                    return restaurantWeekdays;
                }

                public void setRestaurantWeekdays(List<RestaurantWeekdaysDTO> restaurantWeekdays) {
                    this.restaurantWeekdays = restaurantWeekdays;
                }

                public List<RestoPropertyPriceDTO> getRestoPropertyPrice() {
                    return restoPropertyPrice;
                }

                public void setRestoPropertyPrice(List<RestoPropertyPriceDTO> restoPropertyPrice) {
                    this.restoPropertyPrice = restoPropertyPrice;
                }

                public List<?> getRestotype() {
                    return restotype;
                }

                public void setRestotype(List<?> restotype) {
                    this.restotype = restotype;
                }

                public static class LogoDTO {

                    private int id;
                    private String image;
                    private int propertyId;
                    private String url;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public int getPropertyId() {
                        return propertyId;
                    }

                    public void setPropertyId(int propertyId) {
                        this.propertyId = propertyId;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class DresscodeDTO {

                    private int id;
                    private String name;
                    private String slug;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSlug() {
                        return slug;
                    }

                    public void setSlug(String slug) {
                        this.slug = slug;
                    }
                }

                public static class PropertyBookingTimeSlotsDTO {

                    private String timeSlot;

                    public String getTimeSlot() {
                        return timeSlot;
                    }

                    public void setTimeSlot(String timeSlot) {
                        this.timeSlot = timeSlot;
                    }
                }

                public static class ModifiedWeekdaysDTO {
                    private String day;
                    private String opensAt;
                    private String closesAt;

                    public String getDay() {
                        return day;
                    }

                    public void setDay(String day) {
                        this.day = day;
                    }

                    public String getOpensAt() {
                        return opensAt;
                    }

                    public void setOpensAt(String opensAt) {
                        this.opensAt = opensAt;
                    }

                    public String getClosesAt() {
                        return closesAt;
                    }

                    public void setClosesAt(String closesAt) {
                        this.closesAt = closesAt;
                    }
                }

                public static class CuisinesDTO {

                    private int id;
                    private int propertyId;
                    private int cuisineId;
                    private CuisineDTO cuisine;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getPropertyId() {
                        return propertyId;
                    }

                    public void setPropertyId(int propertyId) {
                        this.propertyId = propertyId;
                    }

                    public int getCuisineId() {
                        return cuisineId;
                    }

                    public void setCuisineId(int cuisineId) {
                        this.cuisineId = cuisineId;
                    }

                    public CuisineDTO getCuisine() {
                        return cuisine;
                    }

                    public void setCuisine(CuisineDTO cuisine) {
                        this.cuisine = cuisine;
                    }

                    public static class CuisineDTO {

                        private int id;
                        private String name;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }
                    }
                }

                public static class ImagesDTO {

                    private int id;
                    private String image;
                    private int propertyId;
                    private String url;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public int getPropertyId() {
                        return propertyId;
                    }

                    public void setPropertyId(int propertyId) {
                        this.propertyId = propertyId;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class RestaurantPropertySeatTypeDTO {

                    private int id;
                    private int restaurantPropertyId;
                    private int seatTypeId;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getRestaurantPropertyId() {
                        return restaurantPropertyId;
                    }

                    public void setRestaurantPropertyId(int restaurantPropertyId) {
                        this.restaurantPropertyId = restaurantPropertyId;
                    }

                    public int getSeatTypeId() {
                        return seatTypeId;
                    }

                    public void setSeatTypeId(int seatTypeId) {
                        this.seatTypeId = seatTypeId;
                    }
                }

                public static class RestaurantPropertyDinnerTypeDTO {

                    private int id;
                    private int restaurantPropertyId;
                    private int dinnerTypeId;
                    private String status;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getRestaurantPropertyId() {
                        return restaurantPropertyId;
                    }

                    public void setRestaurantPropertyId(int restaurantPropertyId) {
                        this.restaurantPropertyId = restaurantPropertyId;
                    }

                    public int getDinnerTypeId() {
                        return dinnerTypeId;
                    }

                    public void setDinnerTypeId(int dinnerTypeId) {
                        this.dinnerTypeId = dinnerTypeId;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }
                }

                public static class RestaurantPropertyAmenitiesDTO {

                    private int id;
                    private int amenitieId;
                    private int restaurantPropertyId;
                    private AmenetyDTO amenety;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getAmenitieId() {
                        return amenitieId;
                    }

                    public void setAmenitieId(int amenitieId) {
                        this.amenitieId = amenitieId;
                    }

                    public int getRestaurantPropertyId() {
                        return restaurantPropertyId;
                    }

                    public void setRestaurantPropertyId(int restaurantPropertyId) {
                        this.restaurantPropertyId = restaurantPropertyId;
                    }

                    public AmenetyDTO getAmenety() {
                        return amenety;
                    }

                    public void setAmenety(AmenetyDTO amenety) {
                        this.amenety = amenety;
                    }

                    public static class AmenetyDTO {

                        private int id;
                        private int propertyId;
                        private String amenity;
                        private String amenityLogo;
                        private String logoAmenityUrl;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public int getPropertyId() {
                            return propertyId;
                        }

                        public void setPropertyId(int propertyId) {
                            this.propertyId = propertyId;
                        }

                        public String getAmenity() {
                            return amenity;
                        }

                        public void setAmenity(String amenity) {
                            this.amenity = amenity;
                        }

                        public String getAmenityLogo() {
                            return amenityLogo;
                        }

                        public void setAmenityLogo(String amenityLogo) {
                            this.amenityLogo = amenityLogo;
                        }

                        public String getLogoAmenityUrl() {
                            return logoAmenityUrl;
                        }

                        public void setLogoAmenityUrl(String logoAmenityUrl) {
                            this.logoAmenityUrl = logoAmenityUrl;
                        }
                    }
                }

                public static class RestaurantWeekdaysDTO {
                    private int id;
                    private int propertyId;
                    private String day;
                    private int itemNumber;
                    private int status;
                    private String opensAt;
                    private String closesAt;
                    private Object open;
                    private Object close;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getPropertyId() {
                        return propertyId;
                    }

                    public void setPropertyId(int propertyId) {
                        this.propertyId = propertyId;
                    }

                    public String getDay() {
                        return day;
                    }

                    public void setDay(String day) {
                        this.day = day;
                    }

                    public int getItemNumber() {
                        return itemNumber;
                    }

                    public void setItemNumber(int itemNumber) {
                        this.itemNumber = itemNumber;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public String getOpensAt() {
                        return opensAt;
                    }

                    public void setOpensAt(String opensAt) {
                        this.opensAt = opensAt;
                    }

                    public String getClosesAt() {
                        return closesAt;
                    }

                    public void setClosesAt(String closesAt) {
                        this.closesAt = closesAt;
                    }

                    public Object getOpen() {
                        return open;
                    }

                    public void setOpen(Object open) {
                        this.open = open;
                    }

                    public Object getClose() {
                        return close;
                    }

                    public void setClose(Object close) {
                        this.close = close;
                    }
                }

                public static class RestoPropertyPriceDTO {

                    private int id;
                    private int propertyId;
                    private int pricesId;
                    private String created;
                    private PriceDTO price;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getPropertyId() {
                        return propertyId;
                    }

                    public void setPropertyId(int propertyId) {
                        this.propertyId = propertyId;
                    }

                    public int getPricesId() {
                        return pricesId;
                    }

                    public void setPricesId(int pricesId) {
                        this.pricesId = pricesId;
                    }

                    public String getCreated() {
                        return created;
                    }

                    public void setCreated(String created) {
                        this.created = created;
                    }

                    public PriceDTO getPrice() {
                        return price;
                    }

                    public void setPrice(PriceDTO price) {
                        this.price = price;
                    }

                    public static class PriceDTO {

                        private int id;

                        private String digit;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getDigit() {
                            return digit;
                        }

                        public void setDigit(String digit) {
                            this.digit = digit;
                        }
                    }
                }
            }
        }
    }
}
