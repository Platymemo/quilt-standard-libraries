/*
 * Copyright 2022 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.qsl.worldgen.surface_rule.impl;

import org.jetbrains.annotations.ApiStatus;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

@ApiStatus.Internal
public class QuiltSurfaceRuleInitializer implements ModInitializer {
	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registry.MATERIAL_RULE_WORLDGEN, new Identifier(mod.metadata().id(), "reloadable_sequence"),
				ReloadableSequenceMaterialRule.RULE_CODEC.codec()
		);
	}
}
