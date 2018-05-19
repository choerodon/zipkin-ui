package io.choerodon.zipkin;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.metrics.buffer.CounterBuffers;
import org.springframework.boot.actuate.metrics.buffer.GaugeBuffers;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zipkin.collector.CollectorMetrics;
import zipkin.server.ActuateCollectorMetrics;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinUiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinUiApplication.class, args);
    }

    @Bean(name = "myCollectorMetrics")
    CollectorMetrics metrics(Optional<CounterBuffers> counterBuffers, Optional<GaugeBuffers> gaugeBuffers) {
        return new ActuateCollectorMetrics(counterBuffers.orElse(new CounterBuffers()),
                gaugeBuffers.orElse(new GaugeBuffers()));
    }
}

