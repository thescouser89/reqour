/**
 * Copyright 2024 Red Hat, Inc.
 * SPDX-License-Identifier: Apache-2.0
 */
package org.jboss.pnc.reqour.adjust.profiles;

import org.jboss.pnc.reqour.common.profile.CommonTestProfile;

import java.util.Set;

public class SbtAdjustProfile extends CommonTestProfile {

    @Override
    public Set<String> tags() {
        return Set.of(TestTag.SBT.name(), TestTag.ADJUST.name());
    }
}
