package com.decathlon.poc.api;

import com.decathlon.poc.sap.api.V1ApiDelegate;
import com.decathlon.poc.sap.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;


@Service
public class SapApiImpl implements V1ApiDelegate {

    @Override
    public ResponseEntity<Void> abort(Long executionId) {
        return V1ApiDelegate.super.abort(executionId);
    }

    @Override
    public ResponseEntity<Void> cancel(Integer id) {
        return V1ApiDelegate.super.cancel(id);
    }

    @Override
    public ResponseEntity<CancelItemsResponse> cancelByFulfiller(String shippingId, String containerId, CancelItemsRequest cancelItemsRequest) {
        return V1ApiDelegate.super.cancelByFulfiller(shippingId, containerId, cancelItemsRequest);
    }

    @Override
    public ResponseEntity<Void> confirmCancellationByMerchant(List<ContainerToConfirmCancellation> containerToConfirmCancellation) {
        return V1ApiDelegate.super.confirmCancellationByMerchant(containerToConfirmCancellation);
    }

    @Override
    public ResponseEntity<Void> delete(String id) {
        return V1ApiDelegate.super.delete(id);
    }

    @Override
    public ResponseEntity<RetriableJobDefinition> findJobDefinition(String jobName) {
        return V1ApiDelegate.super.findJobDefinition(jobName);
    }

    @Override
    public ResponseEntity<Void> flushByKey(String cacheName, String key) {
        return V1ApiDelegate.super.flushByKey(cacheName, key);
    }

    @Override
    public ResponseEntity<Void> flushByKey1(String cacheName) {
        return V1ApiDelegate.super.flushByKey1(cacheName);
    }

    @Override
    public ResponseEntity<Map<String, Object>> get(String cacheName, String key) {
        return V1ApiDelegate.super.get(cacheName, key);
    }

    @Override
    public ResponseEntity<RetriableJobExecution> get1(Long executionId) {
        return V1ApiDelegate.super.get1(executionId);
    }

    @Override
    public ResponseEntity<Replay> get2(Integer id) {
        return V1ApiDelegate.super.get2(id);
    }

    @Override
    public ResponseEntity<ContainerEntity> getContainerEntityForProjectTeam(String shippingId, String containerId) {
        return V1ApiDelegate.super.getContainerEntityForProjectTeam(shippingId, containerId);
    }

    @Override
    public ResponseEntity<ContainerInformation> getContainerInformation(String shippingId, String containerId) {
        return V1ApiDelegate.super.getContainerInformation(shippingId, containerId);
    }

    @Override
    public ResponseEntity<List<ContainerEntity>> getShippings(String countryCode, Integer maxPageSize, OffsetDateTime submittedAtStart, OffsetDateTime submittedAtEnd, OffsetDateTime validatedAtStart, OffsetDateTime validatedAtEnd, OffsetDateTime cancelledAtStart, OffsetDateTime cancelledAtEnd, OffsetDateTime etaFromStart, OffsetDateTime etaToEnd, OffsetDateTime promiseShippingDateStart, OffsetDateTime promiseShippingDateEnd, List<String> status, List<String> subStatus, List<String> fulfillmentType, String shortenContainerId, String carrierMethodCode, String carrierCode, String zoneId, String finalZoneId, String orderId) {
        return V1ApiDelegate.super.getShippings(countryCode, maxPageSize, submittedAtStart, submittedAtEnd, validatedAtStart, validatedAtEnd, cancelledAtStart, cancelledAtEnd, etaFromStart, etaToEnd, promiseShippingDateStart, promiseShippingDateEnd, status, subStatus, fulfillmentType, shortenContainerId, carrierMethodCode, carrierCode, zoneId, finalZoneId, orderId);
    }

    @Override
    public ResponseEntity<Zone> getZone(String id) {
        Zone zone = new Zone();
        zone.zoneId("zoneId");
        zone.country("country");
        zone.division("division");
        return ResponseEntity.ok(zone);
    }

    @Override
    public ResponseEntity<Object> getZones(String division, String country) {
        return V1ApiDelegate.super.getZones(division, country);
    }

    @Override
    public ResponseEntity<List<Zone>> getZonesByIds(List<String> requestBody) {
        return V1ApiDelegate.super.getZonesByIds(requestBody);
    }

    @Override
    public ResponseEntity<Object> list() {
        return V1ApiDelegate.super.list();
    }

    @Override
    public ResponseEntity<List<RetriableJobDefinition>> listAll() {
        return V1ApiDelegate.super.listAll();
    }

    @Override
    public ResponseEntity<List<RetriableJobExecution>> listAll1(String jobName, String status, String errorMessage, Range range) {
        return V1ApiDelegate.super.listAll1(jobName, status, errorMessage, range);
    }

    @Override
    public ResponseEntity<Void> pause(String jobName) {
        return V1ApiDelegate.super.pause(jobName);
    }

    @Override
    public ResponseEntity<Void> ping() {
        return V1ApiDelegate.super.ping();
    }

    @Override
    public ResponseEntity<Void> put(String id, ZoneDTO zoneDTO) {
        return V1ApiDelegate.super.put(id, zoneDTO);
    }

    @Override
    public ResponseEntity<Void> reject(String shippingId, String containerId) {
        return V1ApiDelegate.super.reject(shippingId, containerId);
    }

    @Override
    public ResponseEntity<Void> replay(ReplayContext replayContext, Boolean forceNow, Boolean clearCache) {
        return V1ApiDelegate.super.replay(replayContext, forceNow, clearCache);
    }

    @Override
    public ResponseEntity<Void> replayAPartitionFromAGivenOffset(String topic, Integer partition, Integer offset) {
        return V1ApiDelegate.super.replayAPartitionFromAGivenOffset(topic, partition, offset);
    }

    @Override
    public ResponseEntity<Void> reset(Long executionId) {
        return V1ApiDelegate.super.reset(executionId);
    }

    @Override
    public ResponseEntity<BookingConfirmation> submitShipping(ShippingSubmission shippingSubmission) {
        return V1ApiDelegate.super.submitShipping(shippingSubmission);
    }

    @Override
    public ResponseEntity<Void> trackDelivery(String shippingId, String containerId, DeliveryMessage deliveryMessage) {
        return V1ApiDelegate.super.trackDelivery(shippingId, containerId, deliveryMessage);
    }

    @Override
    public ResponseEntity<Void> trackPickup(String shippingId, String containerId, TrackingMessage trackingMessage) {
        return V1ApiDelegate.super.trackPickup(shippingId, containerId, trackingMessage);
    }

    @Override
    public ResponseEntity<Void> trackShippingV1(TrackShippingV1 trackShippingV1) {
        return V1ApiDelegate.super.trackShippingV1(trackShippingV1);
    }

    @Override
    public ResponseEntity<Void> unbookShipping(ShippingUnbookInput shippingUnbookInput) {
        return V1ApiDelegate.super.unbookShipping(shippingUnbookInput);
    }

    @Override
    public ResponseEntity<Void> unpause(String jobName) {
        return V1ApiDelegate.super.unpause(jobName);
    }

    @Override
    public ResponseEntity<Void> validate(String shippingId, String containerId) {
        return V1ApiDelegate.super.validate(shippingId, containerId);
    }

    @Override
    public ResponseEntity<Void> validateShipping(OneFFShippingValidation oneFFShippingValidation) {
        return V1ApiDelegate.super.validateShipping(oneFFShippingValidation);
    }

    @Override
    public ResponseEntity<List<ContainerCancellationDecision>> verifyMerchantCancellationEligibility(List<ContainerToCancel> containerToCancel) {
        return V1ApiDelegate.super.verifyMerchantCancellationEligibility(containerToCancel);
    }
}
