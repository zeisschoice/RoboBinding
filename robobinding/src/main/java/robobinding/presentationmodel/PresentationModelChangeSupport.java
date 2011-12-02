/**
 * PresentationModelChangeSupport.java
 * 12 Nov 2011 Copyright Cheng Wei and Robert Taylor
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package robobinding.presentationmodel;

import robobinding.property.PresentationModelPropertyChangeListener;
import robobinding.property.PresentationModelPropertyChangeSupport;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 * @author Cheng Wei
 */
public class PresentationModelChangeSupport
{
	private PresentationModelPropertyChangeSupport propertyChangeSupport;
	public PresentationModelChangeSupport(Object presentationModel)
	{
		propertyChangeSupport = new PresentationModelPropertyChangeSupport(presentationModel);
	}
	public void addPropertyChangeListener(String propertyName, PresentationModelPropertyChangeListener listener)
	{
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName, PresentationModelPropertyChangeListener listener)
	{
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

	public void firePropertyChange(String propertyName)
	{
		propertyChangeSupport.firePropertyChange(propertyName);
	}

	public void fireChangeAll()
	{
		propertyChangeSupport.fireChangeAll();
	}
}