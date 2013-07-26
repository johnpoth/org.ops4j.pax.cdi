/*
 * Copyright (c) OSGi Alliance (2011, 2013). All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.osgi.service.cdi;

import org.osgi.framework.ServiceRegistration;

/**
 * CDI Event sent by the CDI extender whenever a component
 * has been registered or unregistered to/from the OSGi
 * registry.
 *
 * @see ComponentRegistered
 * @see ComponentUnregistered
 * @see javax.enterprise.event.Observes
 */
public class ComponentEvent<T> {

    private final ServiceRegistration<T> registration;
    private final T service;

    public ComponentEvent(ServiceRegistration<T> registration, T service) {
        this.registration = registration;
        this.service = service;
    }

    public ServiceRegistration<T> getRegistration() {
        return registration;
    }

    public T getService() {
        return service;
    }

}
